/**
 * Copyright 2006 Cordys R&D B.V. 
 * 
 * This file is part of the Cordys Build Framework. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 package com.cordys.coe.ant.bf.upgrade.bf160;

import org.apache.tools.ant.Project;

import com.cordys.coe.ant.bf.upgrade.BFUpgradeException;
import com.cordys.coe.ant.bf.upgrade.UpgradeManagerTask;
import com.cordys.coe.ant.bf.upgrade.base.UpdateScriptBase;

/**
 * This class upgrades the project to the 1.6.6 level. The things that need
 * to be done:<br>
 * 1. Copy the all .cmd files to the project root (prompts were removed).<br>
 *
 * @author mpoyhone
 */
public class UpgradeTo1_6_6 extends UpdateScriptBase
{
    /**
     * This method upgrades the project to the proper version.
     *
     * @param pProject The current Ant project.
     * @param umtTask The task that is currently being executed.
     *
     * @throws BFUpgradeException In case of any exceptions.
     *
     * @see com.cordys.coe.ant.bf.upgrade.IUpgradeScript#execute(org.apache.tools.ant.Project,
     *      com.cordys.coe.ant.bf.upgrade.UpgradeManagerTask)
     */
    public void execute(Project pProject, UpgradeManagerTask umtTask)
                 throws BFUpgradeException
    {
        m_pProject = pProject;
        copyCMDFiles();
    }
}
