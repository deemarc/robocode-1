/*******************************************************************************
 * Copyright (c) 2001, 2008 Mathew A. Nelson and Robocode contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://robocode.sourceforge.net/license/cpl-v10.html
 *
 * Contributors:
 *     Pavel Savara
 *     - Initial implementation
 *******************************************************************************/
package robocode.peer;

import robocode.repository.RobotFileSpecification;
import robocode.manager.NameManager;

/**
 * @author Pavel Savara (original)
 */
public final class RobotStatics {
    public RobotStatics(NameManager cnm, int duplicate){
        if (duplicate > 0) {
            isDuplicate = true;

            String countString = " (" + (duplicate + 1) + ')';

            name = cnm.getFullClassNameWithVersion() + countString;
            shortName = cnm.getUniqueShortClassNameWithVersion() + countString;
            veryShortName = cnm.getUniqueVeryShortClassNameWithVersion() + countString;
            nonVersionedName = cnm.getFullClassName() + countString;
        } else {
            isDuplicate = false;

            name = cnm.getFullClassNameWithVersion();
            shortName = cnm.getUniqueShortClassNameWithVersion();
            veryShortName = cnm.getUniqueVeryShortClassNameWithVersion();
            nonVersionedName = cnm.getFullClassName();
        }
        isJuniorRobot = false;
        isInteractiveRobot = false;
        isPaintRobot = false;
        isAdvancedRobot = false;
        isTeamRobot = false;
        isDroid = false;
    }

    public RobotStatics(RobotFileSpecification spec, RobotStatics names){
        isJuniorRobot = spec.isJuniorRobot();
        isInteractiveRobot = spec.isInteractiveRobot();
        isPaintRobot = spec.isPaintRobot();
        isAdvancedRobot = spec.isAdvancedRobot();
        isTeamRobot = spec.isTeamRobot();
        isDroid = spec.isDroid();
        isDuplicate = names.isDuplicate();
        name = names.getName();
        shortName = names.getShortName();
        veryShortName = names.getVeryShortName();
        nonVersionedName = names.getNonVersionedName();
    }

    private final boolean isDuplicate;
    private final boolean isJuniorRobot;
    private final boolean isInteractiveRobot;
    private final boolean isPaintRobot;
    private final boolean isAdvancedRobot;
    private final boolean isTeamRobot;
    private final boolean isDroid;
    private final String name;
    private final String shortName;
    private final String veryShortName;
    private final String nonVersionedName;

    public boolean isDuplicate() {
        return isDuplicate;
    }

    public boolean isJuniorRobot() {
        return isJuniorRobot;
    }

    public boolean isInteractiveRobot() {
        return isInteractiveRobot;
    }

    public boolean isPaintRobot() {
        return isPaintRobot;
    }

    public boolean isAdvancedRobot() {
        return isAdvancedRobot;
    }

    public boolean isTeamRobot() {
        return isTeamRobot;
    }

    public boolean isDroid() {
        return isDroid;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public String getVeryShortName() {
        return veryShortName;
    }

    public String getNonVersionedName() {
        return nonVersionedName;
    }
}