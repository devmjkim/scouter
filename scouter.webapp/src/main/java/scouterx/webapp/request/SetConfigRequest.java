/*
 *  Copyright 2015 the original author or authors.
 *  @https://github.com/scouter-project/scouter
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package scouterx.webapp.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import scouter.lang.constants.ParamConstant;
import scouterx.webapp.framework.client.server.ServerManager;

import javax.validation.constraints.NotNull;

/**
 * @author yosong.heo (yosong.heo@gmail.com) on 2023. 2. 18.
 */
@Getter
@Setter
@ToString
public class SetConfigRequest {

    @NotNull
    private String values;


}
