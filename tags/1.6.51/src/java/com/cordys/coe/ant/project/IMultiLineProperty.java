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
package com.cordys.coe.ant.project;

/**
 * This interface describes the action for the subtypes of the CreateMultiLineProperty task.
 *
 * @author pgussow
  */
public interface IMultiLineProperty
{
    /**
     * This method is executed to build the final string.
     *
     * @param sbString The string to append it to.
     */
    public void addContent(StringBuilder sbString);
}