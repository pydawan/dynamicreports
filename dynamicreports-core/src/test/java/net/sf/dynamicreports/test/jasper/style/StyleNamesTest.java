/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 * <p>
 * Copyright (C) 2010 - 2018 Ricardo Mariaca http://www.dynamicreports.org
 * <p>
 * This file is part of DynamicReports.
 * <p>
 * DynamicReports is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or (at your option) any later version.
 * <p>
 * DynamicReports is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.dynamicreports.test.jasper.style;

import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.builder.style.TemplateStyleBuilder;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JasperDesign;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

import static net.sf.dynamicreports.report.builder.DynamicReports.cmp;
import static net.sf.dynamicreports.report.builder.DynamicReports.report;
import static net.sf.dynamicreports.report.builder.DynamicReports.stl;

/**
 * @author Ramunas Belkauskas
 */
public class StyleNamesTest {

    private static final String jrtxStr =
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<!DOCTYPE jasperTemplate PUBLIC \"-//JasperReports//DTD Template//EN\" \"http://jasperreports.sourceforge.net/dtds/jaspertemplate.dtd\">\n" +
            "<jasperTemplate>\n" + "  <style name=\"MyBoldStyle2\" isBold=\"true\"/>\n" + "</jasperTemplate>";

    private static void assertContainsStyleWithName(final String name, final Iterable<JRStyle> styles) {
        Assert.assertNotNull(name);
        Assert.assertNotNull(styles);
        JRStyle found = null;
        for (final JRStyle style : styles) {
            if (name.equals(style.getName())) {
                found = style;
                break;
            }
        }
        Assert.assertNotNull(String.format("Style with name \"%s\" not found", name), found);
    }

    @Test
    public void testStyleFromTemplateName() throws DRException {
        final ByteArrayInputStream is = new ByteArrayInputStream(jrtxStr.getBytes(Charset.forName("UTF-8")));
        // name defined in style template:
        final TemplateStyleBuilder templateStyle = stl.templateStyle("MyBoldStyle2");
        final JasperReportBuilder builder = report().addTemplateStyle(stl.loadStyles(is))
                                                    .title(cmp.text("Some title")
                                                              .setStyle(templateStyle));
        final JasperDesign design = builder.toJasperDesign();
        assertContainsStyleWithName("MyBoldStyle2", design.getStylesList());
    }

    @Test
    public void testStyleName() throws DRException {
        final String styleName = "MyBoldStyle";
        // name explicitly set:
        final StyleBuilder tucne = stl.style()
                                      .setName(styleName)
                                      .setFont(stl.font()
                                                  .bold());
        final JasperReportBuilder builder = report().title(cmp.text("Some title")
                                                              .setStyle(tucne));
        final JasperDesign design = builder.toJasperDesign();
        assertContainsStyleWithName(styleName, design.getStylesList());
    }
}
