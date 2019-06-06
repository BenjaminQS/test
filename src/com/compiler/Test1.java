package com.compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Test1 {
	public static void main(String[] args) throws IOException {
		
		String rt = "\r\n";
		
		String src = "package com.dynamic.proxy;" + rt +
				
				"public class TankTimeProxy implements Moveable{" + rt +

				"Moveable t;" + rt +

				"public TankTimeProxy(Moveable t) {" +  rt +
				"super();" +  rt +
				"this.t = t;" +  rt +
				"}" + rt +

				"@Override" +  rt +
				"public void move() {" + rt +

				"long start = System.currentTimeMillis();" +  rt +
				"System.out.println(\"start...\");" + rt +

				"t.move();" + rt +

				"long end = System.currentTimeMillis();" +  rt +
				"System.out.println(\"time: \" + (end-start));" +  rt +
				"}" + rt +
				"}";
		String fileName = System.getProperty("user.dir") + "/src/com/dynamic/proxy/TankTimeProxy.java ";

		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		t.call();
		fileMgr.close();
 	}
}
