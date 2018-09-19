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

package net.sf.dynamicreports.report.base.chart.dataset;

import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.definition.chart.dataset.DRICategoryDataset;

/**
 * <p>DRCategoryDataset class.</p>
 *
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 * @version $Id: $Id
 */
public class DRCategoryDataset extends DRSeriesDataset implements DRICategoryDataset {
    private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;

    private Boolean useSeriesAsCategory;

    /** {@inheritDoc} */
    @Override
    public Boolean getUseSeriesAsCategory() {
        return useSeriesAsCategory;
    }

    /**
     * <p>Setter for the field <code>useSeriesAsCategory</code>.</p>
     *
     * @param useSeriesAsCategory a {@link java.lang.Boolean} object.
     */
    public void setUseSeriesAsCategory(Boolean useSeriesAsCategory) {
        this.useSeriesAsCategory = useSeriesAsCategory;
    }
}
