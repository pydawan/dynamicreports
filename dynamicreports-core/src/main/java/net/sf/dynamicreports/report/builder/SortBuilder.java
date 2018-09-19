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

package net.sf.dynamicreports.report.builder;

import net.sf.dynamicreports.report.base.DRSort;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.constant.OrderType;
import net.sf.dynamicreports.report.definition.expression.DRIExpression;
import org.apache.commons.lang3.Validate;

/**
 * <p>SortBuilder class.</p>
 *
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 * @version $Id: $Id
 */
public class SortBuilder extends AbstractBuilder<SortBuilder, DRSort> {
    private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;

    /**
     * <p>Constructor for SortBuilder.</p>
     *
     * @param column a {@link net.sf.dynamicreports.report.builder.column.TextColumnBuilder} object.
     */
    protected SortBuilder(TextColumnBuilder<?> column) {
        super(new DRSort());
        Validate.notNull(column, "column must not be null");
        getObject().setExpression(column.build());
    }

    /**
     * <p>Constructor for SortBuilder.</p>
     *
     * @param field a {@link net.sf.dynamicreports.report.builder.FieldBuilder} object.
     */
    protected SortBuilder(FieldBuilder<?> field) {
        super(new DRSort());
        Validate.notNull(field, "field must not be null");
        getObject().setExpression(field.build());
    }

    /**
     * <p>Constructor for SortBuilder.</p>
     *
     * @param variable a {@link net.sf.dynamicreports.report.builder.VariableBuilder} object.
     */
    protected SortBuilder(VariableBuilder<?> variable) {
        super(new DRSort());
        Validate.notNull(variable, "variable must not be null");
        getObject().setExpression(variable.build());
    }

    /**
     * <p>Constructor for SortBuilder.</p>
     *
     * @param expression a {@link net.sf.dynamicreports.report.definition.expression.DRIExpression} object.
     */
    protected SortBuilder(DRIExpression<?> expression) {
        super(new DRSort());
        getObject().setExpression(expression);
    }

    /**
     * <p>setOrderType.</p>
     *
     * @param orderType a {@link net.sf.dynamicreports.report.constant.OrderType} object.
     * @return a {@link net.sf.dynamicreports.report.builder.SortBuilder} object.
     */
    public SortBuilder setOrderType(OrderType orderType) {
        getObject().setOrderType(orderType);
        return this;
    }
}
