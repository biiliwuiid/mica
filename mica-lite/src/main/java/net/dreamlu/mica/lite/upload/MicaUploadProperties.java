/*
 * Copyright (c) 2019-2029, Dreamlu 卢春梦 (596392912@qq.com & www.dreamlu.net).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dreamlu.mica.lite.upload;

import lombok.Getter;
import lombok.Setter;
import net.dreamlu.mica.core.utils.PathUtil;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.lang.Nullable;

/**
 * 文件上传配置
 *
 * @author L.cm
 */
@Getter
@Setter
@RefreshScope
@ConfigurationProperties("mica.upload")
public class MicaUploadProperties {

	/**
	 * 上传的文件 路径匹配
	 */
	private String uploadPathPattern = "/upload/**";

	/**
	 * 文件保存目录，默认：jar 包同级目录
	 */
	@Nullable
	private String savePath = PathUtil.getJarPath() + "/upload";

}
