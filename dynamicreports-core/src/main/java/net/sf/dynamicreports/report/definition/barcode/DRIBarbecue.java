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

package net.sf.dynamicreports.report.definition.barcode;

import net.sf.dynamicreports.report.constant.BarbecueType;
import net.sf.dynamicreports.report.constant.BarcodeOrientation;
import net.sf.dynamicreports.report.definition.component.DRIDimensionComponent;
import net.sf.dynamicreports.report.definition.expression.DRIExpression;

/**
 * <p>DRIBarbecue interface.</p>
 *
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 * @version $Id: $Id
 */
public interface DRIBarbecue extends DRIDimensionComponent {

    /**
     * <p>getType.</p>
     *
     * @return a {@link net.sf.dynamicreports.report.constant.BarbecueType} object.
     */
    public BarbecueType getType();

    /**
     * <p>getCodeExpression.</p>
     *
     * @return a {@link net.sf.dynamicreports.report.definition.expression.DRIExpression} object.
     */
    public DRIExpression<String> getCodeExpression();

    /**
     * <p>getApplicationIdentifierExpression.</p>
     *
     * @return a {@link net.sf.dynamicreports.report.definition.expression.DRIExpression} object.
     */
    public DRIExpression<String> getApplicationIdentifierExpression();

    /**
     * <p>getDrawText.</p>
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getDrawText();

    /**
     * <p>getChecksumRequired.</p>
     *
     * @return a {@link java.lang.Boolean} object.
     */
    public Boolean getChecksumRequired();

    /**
     * <p>getBarWidth.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getBarWidth();

    /**
     * <p>getBarHeight.</p>
     *
     * @return a {@link java.lang.Integer} object.
     */
    public Integer getBarHeight();

    /**
     * <p>getOrientation.</p>
     *
     * @return a {@link net.sf.dynamicreports.report.constant.BarcodeOrientation} object.
     */
    public BarcodeOrientation getOrientation();
}
