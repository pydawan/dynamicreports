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

package net.sf.dynamicreports.design.base.chart.plot;

import net.sf.dynamicreports.design.definition.chart.plot.DRIDesignHighLowPlot;
import net.sf.dynamicreports.report.constant.Constants;

/**
 * <p>DRDesignHighLowPlot class.</p>
 *
 * @author Ricardo Mariaca (r.mariaca@dynamicreports.org)
 * @version $Id: $Id
 */
public class DRDesignHighLowPlot extends DRDesignAxisPlot implements DRIDesignHighLowPlot {
    private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;

    private Boolean showOpenTicks;
    private Boolean showCloseTicks;

    /** {@inheritDoc} */
    @Override
    public Boolean getShowOpenTicks() {
        return showOpenTicks;
    }

    /**
     * <p>Setter for the field <code>showOpenTicks</code>.</p>
     *
     * @param showOpenTicks a {@link java.lang.Boolean} object.
     */
    public void setShowOpenTicks(Boolean showOpenTicks) {
        this.showOpenTicks = showOpenTicks;
    }

    /** {@inheritDoc} */
    @Override
    public Boolean getShowCloseTicks() {
        return showCloseTicks;
    }

    /**
     * <p>Setter for the field <code>showCloseTicks</code>.</p>
     *
     * @param showCloseTicks a {@link java.lang.Boolean} object.
     */
    public void setShowCloseTicks(Boolean showCloseTicks) {
        this.showCloseTicks = showCloseTicks;
    }

}
