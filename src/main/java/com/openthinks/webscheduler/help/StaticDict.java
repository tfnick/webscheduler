/**   
 *  Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
* @Title: StaticDict.java 
* @Package com.openthinks.webscheduler.help 
* @author dailey.yet@outlook.com  
* @date Jul 8, 2016
* @version V1.0   
*/
package com.openthinks.webscheduler.help;

/**
 * @author dailey.yet@outlook.com
 *
 */
public interface StaticDict {

	public static final String PAGE_ATTRIBUTE_TASK_LIST = "tms";
	public static final String PAGE_ATTRIBUTE_TASK_TYPES = "types";
	public static final String PAGE_ATTRIBUTE_SUPPORT_TASKS = "supportTasks";
	public static final String PAGE_ATTRIBUTE_CUSTOM_TASKS = "customTasks";
	public static final String PAGE_ATTRIBUTE_MAP = "pm";
	public static final String PAGE_ATTRIBUTE_TASK_META = "tm";
	public static final String PAGE_ATTRIBUTE_TASK_DEF = "tdf";
	public static final String PAGE_ATTRIBUTE_ERROR_PRE = "error_";
	public static final String PAGE_ATTRIBUTE_ACTIVESIDEBAR = "activeSidebar";
	public static final String PAGE_ATTRIBUTE_TASK_TRIGGERS = "triggers";
	public static final String PAGE_ATTRIBUTE_ROLE_LIST = "roles";
	public static final String PAGE_ATTRIBUTE_USER_LIST = "users";
	public static final String PAGE_ATTRIBUTE_PROTECTED_REF_LIST = "trps";
	public static final String PAGE_ATTRIBUTE_PROTECTED_REF = "trp";
	public static final String PAGE_ATTRIBUTE_IS_IN_SYNC = "isInSync";
	public static final String PAGE_ATTRIBUTE_USER = "user";
	public static final String PAGE_ATTRIBUTE_ROLE = "role";
	public static final String PAGE_ATTRIBUTE_WEB_CONTROLLER_LIST = "webControllers";

	public static final String PAGE_ATTRIBUTE_ERROR_1 = "error_1";
	public static final String PAGE_ATTRIBUTE_ERROR_2 = "error_2";
	public static final String PAGE_ATTRIBUTE_ERROR_3 = "error_3";
	public static final String PAGE_ATTRIBUTE_ERROR_4 = "error_4";
	public static final String PAGE_ATTRIBUTE_ERROR_5 = "error_5";
	public static final String PAGE_ATTRIBUTE_ERROR_6 = "error_6";

	public static final String PAGE_PARAM_TASK_ID = "taskid";
	public static final String PAGE_PARAM_TASK_NAME = "taskname";
	public static final String PAGE_PARAM_TASK_TYPE = "tasktype";
	public static final String PAGE_PARAM_TASK_REF = "taskref";

	public static final String PAGE_PARAM_TASK_SHARED = "taskshared";

	public static final String PAGE_PARAM_TASK_TRIGGER = "tasktrigger";
	public static final String PAGE_PARAM_TASK_DEF_CLASS_NAME = "customtasktype";
	public static final String PAGE_PARAM_TASK_TRIGGER_REPEATABLE = "repeatable";
	public static final String PAGE_PARAM_TASK_TRIGGER_REPEATABLE_ENABLE = "true";
	public static final String PAGE_PARAM_TASK_TRIGGER_REPEAT_COUNT = "repeatcount";
	public static final String PAGE_PARAM_TASK_TRIGGER_REPEAT_INTERVAL = "repeatinterval";
	public static final String PAGE_PARAM_TASK_TRIGGER_ENDDATE = "enddate";
	public static final String PAGE_PARAM_TASK_TRIGGER_STARTDATE = "startdate";
	public static final String PAGE_PARAM_TASK_TRIGGER_CRON_EXPR = "cronexpr";
	public static final String PAGE_PARAM_LOGIN_NAME = "login_username";
	public static final String PAGE_PARAM_LOGIN_PASS = "login_password";
	public static final String PAGE_PARAM_LOGIN_REMEMBER = "login_remember";
	public static final String PAGE_PARAM_LOGIN_REMEMBER_CHECKED_VAL = "CHECKED";
	public static final String PAGE_PARAM_TASK_REF_PROTECTED_CONTENT = "protectedref";
	public static final String PAGE_PARAM_TASK_REF_PROTECTED_ID = "trpid";
	public static final String PAGE_PARAM_USER_ID = "uid";
	public static final String PAGE_PARAM_USER_NAME = "username";
	public static final String PAGE_PARAM_USER_EMAIL = "useremail";
	public static final String PAGE_PARAM_USER_PASS = "userpass";
	public static final String PAGE_PARAM_USER_OLD_PWD = "userpass1";
	public static final String PAGE_PARAM_USER_NEW_PWD = "userpass";
	public static final String PAGE_PARAM_USER_NEW_PWD_AGAIN = "userpass2";
	public static final String PAGE_PARAM_USER_ROLES = "userroles";
	public static final String PAGE_PARAM_ROLE_ID = "roleid";
	public static final String PAGE_PARAM_ROLE_NAME = "rolename";
	public static final String PAGE_PARAM_ROLE_DESC = "roledesc";
	public static final String PAGE_PARAM_ROLE_MAPS = "rolemaps";

	public static final String PAGE_PARAM_LOGGER_LEVEL = "logger_level";

	public static final String PAGE_PARAM_LIST_JOIN = ",";

	public static final String COOKIE_REMEMBER_ME = "quick_login";
	public static final int COOKIE_REMEMBER_ME_EXPIRE_TIME = 7 * 24 * 60 * 60;

	public static final String SERVLET_INIT_PARAM_WEBCONFIGUREPATH = "webConfigurePath";
	public static final String SESSION_ATTR_LOGIN_INFO = "Session-User-^*&)((_+)$%#><?|}|$$%^~~!~@";

	public static final String STORE_DB = "webscheduler.odb";

	public static final String CUSTOM_TASK_DEF_PACKAGE = "com.openthinks.webscheduler.task.custom";
	//public static final String DEFAULT_DATE_FORMAT_STYLE = "yyyy-MM-dd HH:mm:ss";
	public static final String DEFAULT_DATE_FORMAT_STYLE = "yyyy-MM-dd HH:mm";
	public static final String PAGE_PARAM_TASK_DEF_CODE = "taskdef";
	public static final String DISK_STORE_TASKDEF = "taskdef_disk";
	public static final String MEMORY_STORE_TASKDEF = "taskdef_memory";
	public static final String DISK_STORE_TASK = "task_disk";
	public static final String MEMORY_STORE_TASK = "task_memory";
	public static final int NO_REPEAT_TRIGGER = -1;
	public static final int FOREVER_REPEAT_TRIGGER = Integer.MAX_VALUE;
	public static final int DEFAULT_REPEAT_INTERVAL = 0; //3 second

	public static final String TRIGGER_SUFFIX = "-Trigger";
	public static final String DEFAULT_TASK_GROUP_NAME = "default_group";

	//configure constant
	public static final String CLASS_PATH_PREFIX = "classpath:";
	public static final String FILE_PREFIX = "file:";
	public static final String CONF_SECURITY_FILE = "security.file";
	public static final String CONF_REFS_UNCHANGE_PATH = "refs.unchange.path";
	public static final String CONF_MAPDB_FILE = "mapdb.file";
	public static final String CONF_NAMESPACE = "namespace";
	public static final String CONF_EASYWEBCLASSDIR = "easyweb.class.dir";
	public static final String CONF_LOGGER_LEVEL = "logger.level";

	public static final String CONF_QUARTZ_FILE = "quartz.file";

}
