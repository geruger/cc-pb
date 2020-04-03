package cc.permissiom.other;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class AnnoationClassScaner {


    /**
     *
     * @param packageName ("com.cn.xx")
     * @return
     * @throws IOException
     * @throws URISyntaxException
     */
    public static List<Class<?>> scanPackage(String packageName, List<Class<? extends Annotation>> targetAnnotations) throws IOException, URISyntaxException {
        // "com.cn.xx" -> "com/cn/xx"
        String packagePath = packageName.replace(".", "/");
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        List<Class<?>> classes = new ArrayList<>();
        Enumeration<URL> resources = classLoader.getResources(packagePath);
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            if (url.getProtocol().equals("jar")) {
                //handle jar package
            } else {
                File file = new File(url.toURI());
                if (!file.exists()) {
                    System.err.println("file not exists = " + file.getAbsolutePath());
                    continue;
                }
                //handle file package
                List<Class<?>> scanedClasses = classScan(file, packageName, targetAnnotations);
                classes.addAll(scanedClasses);
            }
        }
//        classes.forEach(e -> System.out.println(e.getName()));
        return classes;
    }

    static List<Class<?>> classScan(File curFile, String packageName, List<Class<? extends Annotation>> targetAnnotations) {
        ArrayList<Class<?>> classes = new ArrayList<>();
        if (!curFile.isDirectory()) {
            return classes;
        }
        File[] files = curFile.listFiles();
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".class")) {
                String fileName = file.getName().replace(".class", "");
                String className = packageName + "." + fileName;
                try {
                    Class<?> clazz = Class.forName(className);
                    for (Class<? extends Annotation> annotation : targetAnnotations){
                        if (clazz.isAnnotationPresent(annotation)){
                            classes.add(clazz);
                        }
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } else if (file.isDirectory()) {
                classes.addAll(classScan(file, packageName + "." + file.getName(),targetAnnotations));
            }
        }
        return classes;
    }
}
