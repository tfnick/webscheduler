package com.openthinks.webscheduler.dao.impl;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;

import org.mapdb.Serializer;
import org.mapdb.serializer.GroupSerializer;
import org.mapdb.serializer.SerializerJava;
import org.mapdb.serializer.SerializerUtils;

import com.openthinks.webscheduler.dao.impl.mapdb.MapDBHelper;
import com.openthinks.webscheduler.help.StaticDict;
import com.openthinks.webscheduler.model.task.def.CompileResult;
import com.openthinks.webscheduler.model.task.def.TaskDefRuntimeData;

public class MapDBTest {
	
	public static void main(String[] args) {
		try {
			MapDBHelper.setUp(new File("R:/MyGit/webscheduler/target/classes"), StaticDict.STORE_DB);
		} catch (Exception e) {
		}
		Serializer<TaskDefRuntimeData> serializer=SerializerUtils.serializerForClass(TaskDefRuntimeData.class);
		//NavigableSet<TaskDefRuntimeData> treeSet = MapDBHelper.getDB().treeSet("taskdef").serializer((GroupSerializer<TaskDefRuntimeData>) serializer).createOrOpen();
		
		NavigableSet<TaskDefRuntimeData> treeSet = (NavigableSet<TaskDefRuntimeData>) MapDBHelper.getDB().treeSet("taskdef")
				.serializer(Serializer.JAVA)
				.createOrOpen();
		//treeSet.clear();
		//treeSet.addAll(Arrays.asList(create()));
		
		System.out.println(treeSet.size());
		
		
		Iterator<TaskDefRuntimeData> iter = treeSet.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
			
		}
		
		
		//MapDBHelper.getDB().commit();
		
		MapDBHelper.getDB().close();
	}
	
	public static TaskDefRuntimeData[] create(){
		TaskDefRuntimeData[] taskDefs =new TaskDefRuntimeData[100];
		for(int i=0;i<100;i++){
			TaskDefRuntimeData def =new TaskDefRuntimeData();
			def.setFullName("com.openthinks.webscheduler.task.custom.TestCustomTask"+(i+1));
			def.setFileName("TestCustomTask"+(i+1));
			def.setKeepSourceFile(true);
			def.setLastCompileResult(new CompileResult());
			def.setSourceCode("test"+(i+1));
			taskDefs[i]=def;
		}
		return taskDefs;
	}

}
