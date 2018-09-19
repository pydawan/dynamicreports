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

package net.sf.dynamicreports.report.builder.barcode;

import net.sf.dynamicreports.report.base.barcode.DRPostnetBarcode;
import net.sf.dynamicreports.report.constant.BarcodeBaselinePosition;
import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.definition.expression.DRIExpression;

/**
 * <p>PostnetBarcodeBuilder class.</p>
 *
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 * @version $Id: $Id
 */
public class PostnetBarcodeBuilder extends AbstractChecksumBarcodeBuilder<PostnetBarcodeBuilder, DRPostnetBarcode> {
    private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;

    /**
     * <p>Constructor for PostnetBarcodeBuilder.</p>
     *
     * @param code a {@link java.lang.String} object.
     */
    protected PostnetBarcodeBuilder(String code) {
        super(code, new DRPostnetBarcode());
    }

    /**
     * <p>Constructor for PostnetBarcodeBuilder.</p>
     *
     * @param codeExpression a {@link net.sf.dynamicreports.report.definition.expression.DRIExpression} object.
     */
    protected PostnetBarcodeBuilder(DRIExpression<String> codeExpression) {
        super(codeExpression, new DRPostnetBarcode());
    }

    /**
     * <p>setDisplayChecksum.</p>
     *
     * @param displayChecksum a {@link java.lang.Boolean} object.
     * @return a {@link net.sf.dynamicreports.report.builder.barcode.PostnetBarcodeBuilder} object.
     */
    public PostnetBarcodeBuilder setDisplayChecksum(Boolean displayChecksum) {
        getObject().setDisplayChecksum(displayChecksum);
        return this;
    }

    /**
     * <p>setShortBarHeight.</p>
     *
     * @param shortBarHeight a {@link java.lang.Double} object.
     * @return a {@link net.sf.dynamicreports.report.builder.barcode.PostnetBarcodeBuilder} object.
     */
    public PostnetBarcodeBuilder setShortBarHeight(Double shortBarHeight) {
        getObject().setShortBarHeight(shortBarHeight);
        return this;
    }

    /**
     * <p>setBaselinePosition.</p>
     *
     * @param baselinePosition a {@link net.sf.dynamicreports.report.constant.BarcodeBaselinePosition} object.
     * @return a {@link net.sf.dynamicreports.report.builder.barcode.PostnetBarcodeBuilder} object.
     */
    public PostnetBarcodeBuilder setBaselinePosition(BarcodeBaselinePosition baselinePosition) {
        getObject().setBaselinePosition(baselinePosition);
        return this;
    }

    /**
     * <p>setIntercharGapWidth.</p>
     *
     * @param intercharGapWidth a {@link java.lang.Double} object.
     * @return a {@link net.sf.dynamicreports.report.builder.barcode.PostnetBarcodeBuilder} object.
     */
    public PostnetBarcodeBuilder setIntercharGapWidth(Double intercharGapWidth) {
        getObject().setIntercharGapWidth(intercharGapWidth);
        return this;
    }
}
