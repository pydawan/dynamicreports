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

package net.sf.dynamicreports.test.jasper;

import junit.framework.Assert;
import net.sf.dynamicreports.report.builder.column.ColumnBuilder;
import net.sf.dynamicreports.report.builder.group.GroupBuilder;
import net.sf.dynamicreports.report.builder.subtotal.SubtotalBuilder;
import net.sf.jasperreports.engine.JRImageAlignment;
import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.JRTextAlignment;
import net.sf.jasperreports.engine.base.JRBoxPen;
import net.sf.jasperreports.engine.type.HorizontalImageAlignEnum;
import net.sf.jasperreports.engine.type.HorizontalTextAlignEnum;
import net.sf.jasperreports.engine.type.LineStyleEnum;
import net.sf.jasperreports.engine.type.VerticalImageAlignEnum;
import net.sf.jasperreports.engine.type.VerticalTextAlignEnum;

import java.awt.Color;

/**
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 */
public abstract class AbstractJasperStyleTest extends AbstractJasperTest {

    protected void styleTest(String name, int index, Color foreColor, Color backColor, String fontName, Float fontSize, Boolean bold, Boolean italic) {
        JRStyle style = getElementAt(name, index).getStyle();
        styleTest(style, foreColor, backColor, fontName, fontSize, bold, italic);
    }

    protected void styleTest(JRStyle style, Color foreColor, Color backColor, String fontName, Float fontSize, Boolean bold, Boolean italic) {
        Assert.assertNotNull("style is null", style);
        Assert.assertEquals("foreColor", foreColor, style.getForecolor());
        Assert.assertEquals("backColor", backColor, style.getBackcolor());
        Assert.assertEquals("fontName", fontName, style.getFontName());
        Assert.assertEquals("fontSize", fontSize, style.getFontsize());
        Assert.assertEquals("bold", bold, style.isBold());
        Assert.assertEquals("italic", italic, style.isItalic());
    }

    protected void borderTest(String name, int index, Color topColor, LineStyleEnum topLineStyle, float top, Color bottomColor, LineStyleEnum bottomLineStyle, float bottom, Color leftColor,
                              LineStyleEnum leftLineStyle, float left, Color rightColor, LineStyleEnum rightLineStyle, float right) {
        JRStyle style = getElementAt(name, index).getStyle();

        JRBoxPen pen = style.getLineBox()
                            .getTopPen();
        Assert.assertEquals(new Float(top), pen.getLineWidth());
        Assert.assertEquals(topColor, pen.getLineColor());
        Assert.assertEquals(topLineStyle, pen.getLineStyleValue());

        pen = style.getLineBox()
                   .getBottomPen();
        Assert.assertEquals(new Float(bottom), pen.getLineWidth());
        Assert.assertEquals(bottomColor, pen.getLineColor());
        Assert.assertEquals(bottomLineStyle, pen.getLineStyleValue());

        pen = style.getLineBox()
                   .getLeftPen();
        Assert.assertEquals(new Float(left), pen.getLineWidth());
        Assert.assertEquals(leftColor, pen.getLineColor());
        Assert.assertEquals(leftLineStyle, pen.getLineStyleValue());

        pen = style.getLineBox()
                   .getRightPen();
        Assert.assertEquals(new Float(right), pen.getLineWidth());
        Assert.assertEquals(rightColor, pen.getLineColor());
        Assert.assertEquals(rightLineStyle, pen.getLineStyleValue());
    }

    protected void paddingTest(String name, int index, Integer top, Integer bottom, Integer left, Integer right) {
        JRStyle style = getElementAt(name, index).getStyle();
        Assert.assertEquals(top, style.getLineBox()
                                      .getTopPadding());
        Assert.assertEquals(bottom, style.getLineBox()
                                         .getBottomPadding());
        Assert.assertEquals(left, style.getLineBox()
                                       .getLeftPadding());
        Assert.assertEquals(right, style.getLineBox()
                                        .getRightPadding());
    }

    protected void horizontalAlignmentTest(String name, int index, HorizontalImageAlignEnum horizontalAlignment) {
        JRImageAlignment element = (JRImageAlignment) getElementAt(name, index);
        if (horizontalAlignment == null) {
            Assert.assertEquals("horizontalAlignment", HorizontalImageAlignEnum.LEFT, element.getHorizontalImageAlign());
        }
        Assert.assertEquals("horizontalAlignment", horizontalAlignment, element.getHorizontalImageAlign());
    }

    protected void verticalAlignmentTest(String name, int index, VerticalImageAlignEnum verticalAlignment) {
        JRImageAlignment element = (JRImageAlignment) getElementAt(name, index);
        if (verticalAlignment == null) {
            Assert.assertEquals("verticalAlignment", VerticalTextAlignEnum.TOP, element.getVerticalImageAlign());
        }
        Assert.assertEquals("verticalAlignment", verticalAlignment, element.getVerticalImageAlign());
    }

    protected void horizontalAlignmentTest(String name, int index, HorizontalTextAlignEnum horizontalAlignment) {
        JRTextAlignment element = (JRTextAlignment) getElementAt(name, index);
        if (horizontalAlignment == null) {
            Assert.assertEquals("horizontalAlignment", HorizontalTextAlignEnum.LEFT, element.getHorizontalTextAlign());
        }
        Assert.assertEquals("horizontalAlignment", horizontalAlignment, element.getHorizontalTextAlign());
    }

    protected void verticalAlignmentTest(String name, int index, VerticalTextAlignEnum verticalAlignment) {
        JRTextAlignment element = (JRTextAlignment) getElementAt(name, index);
        if (verticalAlignment == null) {
            Assert.assertEquals("verticalAlignment", VerticalTextAlignEnum.TOP, element.getVerticalTextAlign());
        }
        Assert.assertEquals("verticalAlignment", verticalAlignment, element.getVerticalTextAlign());
    }

    // column detail
    protected void columnDetailStyleTest(ColumnBuilder<?, ?> column, int index, Color foreColor, Color backColor, String fontName, Float fontSize, Boolean bold, Boolean italic) {
        styleTest(JasperTestUtils.getColumnDetailName(column), index, foreColor, backColor, fontName, fontSize, bold, italic);
    }

    protected void columnDetailPaddingTest(ColumnBuilder<?, ?> column, int index, Integer top, Integer bottom, Integer left, Integer right) {
        paddingTest(JasperTestUtils.getColumnDetailName(column), index, top, bottom, left, right);
    }

    protected void columnDetailAlignmentTest(ColumnBuilder<?, ?> column, int index, HorizontalImageAlignEnum horizontalAlignment) {
        horizontalAlignmentTest(JasperTestUtils.getColumnDetailName(column), index, horizontalAlignment);
    }

    protected void columnDetailAlignmentTest(ColumnBuilder<?, ?> column, int index, VerticalImageAlignEnum verticalAlignment) {
        verticalAlignmentTest(JasperTestUtils.getColumnDetailName(column), index, verticalAlignment);
    }

    protected void columnDetailAlignmentTest(ColumnBuilder<?, ?> column, int index, HorizontalTextAlignEnum horizontalAlignment) {
        horizontalAlignmentTest(JasperTestUtils.getColumnDetailName(column), index, horizontalAlignment);
    }

    protected void columnDetailAlignmentTest(ColumnBuilder<?, ?> column, int index, VerticalTextAlignEnum verticalAlignment) {
        verticalAlignmentTest(JasperTestUtils.getColumnDetailName(column), index, verticalAlignment);
    }

    protected void columnDetailBorderTest(ColumnBuilder<?, ?> column, int index, Color topColor, LineStyleEnum topLineStyle, float top, Color bottomColor, LineStyleEnum bottomLineStyle, float bottom,
                                          Color leftColor, LineStyleEnum leftLineStyle, float left, Color rightColor, LineStyleEnum rightLineStyle, float right) {
        borderTest(JasperTestUtils.getColumnDetailName(column), index, topColor, topLineStyle, top, bottomColor, bottomLineStyle, bottom, leftColor, leftLineStyle, left, rightColor, rightLineStyle,
                   right);
    }

    // column title
    protected void columnTitleBorderTest(ColumnBuilder<?, ?> column, int index, Color topColor, LineStyleEnum topLineStyle, float top, Color bottomColor, LineStyleEnum bottomLineStyle, float bottom,
                                         Color leftColor, LineStyleEnum leftLineStyle, float left, Color rightColor, LineStyleEnum rightLineStyle, float right) {
        borderTest(JasperTestUtils.getColumnTitleName(column), index, topColor, topLineStyle, top, bottomColor, bottomLineStyle, bottom, leftColor, leftLineStyle, left, rightColor, rightLineStyle,
                   right);
    }

    protected void columnTitlePaddingTest(ColumnBuilder<?, ?> column, int index, Integer top, Integer bottom, Integer left, Integer right) {
        paddingTest(JasperTestUtils.getColumnTitleName(column), index, top, bottom, left, right);
    }

    protected void columnTitleStyleTest(ColumnBuilder<?, ?> column, int index, Color foreColor, Color backColor, String fontName, Float fontSize, Boolean bold, Boolean italic) {
        styleTest(JasperTestUtils.getColumnTitleName(column), index, foreColor, backColor, fontName, fontSize, bold, italic);
    }

    protected void columnTitleAlignmentTest(ColumnBuilder<?, ?> column, int index, HorizontalTextAlignEnum horizontalAlignment) {
        horizontalAlignmentTest(JasperTestUtils.getColumnTitleName(column), index, horizontalAlignment);
    }

    // subtotal label
    protected void subtotalLabelBorderTest(SubtotalBuilder<?, ?> subtotal, int index, Color topColor, LineStyleEnum topLineStyle, float top, Color bottomColor, LineStyleEnum bottomLineStyle,
                                           float bottom, Color leftColor, LineStyleEnum leftLineStyle, float left, Color rightColor, LineStyleEnum rightLineStyle, float right) {
        borderTest(JasperTestUtils.getSubtotalLabelName(subtotal, 1), index, topColor, topLineStyle, top, bottomColor, bottomLineStyle, bottom, leftColor, leftLineStyle, left, rightColor,
                   rightLineStyle, right);
    }

    protected void subtotalLabelStyleTest(SubtotalBuilder<?, ?> subtotal, int index, Color foreColor, Color backColor, String fontName, Float fontSize, Boolean bold, Boolean italic) {
        styleTest(JasperTestUtils.getSubtotalLabelName(subtotal, 1), index, foreColor, backColor, fontName, fontSize, bold, italic);
    }

    // subtotal
    protected void subtotalBorderTest(SubtotalBuilder<?, ?> subtotal, int index, Color topColor, LineStyleEnum topLineStyle, float top, Color bottomColor, LineStyleEnum bottomLineStyle, float bottom,
                                      Color leftColor, LineStyleEnum leftLineStyle, float left, Color rightColor, LineStyleEnum rightLineStyle, float right) {
        borderTest(JasperTestUtils.getSubtotalName(subtotal, 1), index, topColor, topLineStyle, top, bottomColor, bottomLineStyle, bottom, leftColor, leftLineStyle, left, rightColor, rightLineStyle,
                   right);
    }

    protected void subtotalPaddingTest(SubtotalBuilder<?, ?> subtotal, int index, Integer top, Integer bottom, Integer left, Integer right) {
        paddingTest(JasperTestUtils.getSubtotalName(subtotal, 1), index, top, bottom, left, right);
    }

    protected void subtotalStyleTest(SubtotalBuilder<?, ?> subtotal, int index, Color foreColor, Color backColor, String fontName, Float fontSize, Boolean bold, Boolean italic) {
        styleTest(JasperTestUtils.getSubtotalName(subtotal, 1), index, foreColor, backColor, fontName, fontSize, bold, italic);
    }

    // group header title
    protected void groupHeaderTitleStyleTest(GroupBuilder<?> group, int index, Color foreColor, Color backColor, String fontName, Float fontSize, Boolean bold, Boolean italic) {
        styleTest(JasperTestUtils.getHeaderTitleGroupName(group), index, foreColor, backColor, fontName, fontSize, bold, italic);
    }

    // group header
    protected void groupHeaderStyleTest(GroupBuilder<?> group, int index, Color foreColor, Color backColor, String fontName, Float fontSize, Boolean bold, Boolean italic) {
        styleTest(JasperTestUtils.getHeaderGroupName(group), index, foreColor, backColor, fontName, fontSize, bold, italic);
    }

    protected void groupHeaderAlignmentTest(GroupBuilder<?> group, int index, HorizontalTextAlignEnum horizontalAlignment) {
        horizontalAlignmentTest(JasperTestUtils.getHeaderGroupName(group), index, horizontalAlignment);
    }
}
