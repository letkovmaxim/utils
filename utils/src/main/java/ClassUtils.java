import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class ClassUtils {

    public static void showInfo(Object obj) {
        Class<?> cls = obj.getClass();

        if (!cls.getPackageName().isEmpty()) {
            System.out.println("Пакет :\n    " + cls.getPackageName() + ";");
        }


        System.out.println("Название класса :\n    " + cls.getSimpleName() + ";");


        Annotation[] ann = cls.getDeclaredAnnotations();
        if (ann.length != 0) {
            System.out.println("Аннотации класса :");
            for (Annotation an : ann) {
                System.out.println("    " + an.annotationType().getSimpleName() + ";");
            }
        }


        Class<?> superClass = cls.getSuperclass();
        if (superClass != null) {
            System.out.println("Родитель класса :\n    " + superClass.getSimpleName() + ";");
        }


        Class<?>[] intrf = cls.getInterfaces();
        if (intrf.length != 0) {
            System.out.println("Интерфейсы класса :");
            for (Class<?> intr : intrf) {
                System.out.println("    " + intr.getSimpleName() + ";");
            }
        }


        Class<?>[] clzz = cls.getDeclaredClasses();
        if (clzz.length != 0) {
            System.out.println("Вложенные классы :");
            for (Class<?> clz : clzz) {
                System.out.println("    " + clz.getSimpleName() + ";");
            }
        }

        Field[] fld = cls.getDeclaredFields();
        if (fld.length != 0) {
            System.out.println("Поля класса :");
            for (Field fl : fld) {
                for (Annotation an : fl.getAnnotations()) {
                    System.out.println("    @" + an.annotationType().getSimpleName());
                }
                if (fl.getModifiers() != 0) {
                    System.out.println("    " + Modifier.toString(fl.getModifiers())
                            + " " + fl.getType().getSimpleName()
                            + " " + fl.getName() + ";");
                } else {
                    System.out.println("    " + fl.getType().getSimpleName()
                            + " " + fl.getName() + ";");
                }
            }
        }


        Constructor<?>[] cnstr = cls.getDeclaredConstructors();
        if (cnstr.length != 0) {
            System.out.println("Конструкторы класса :");
            for (Constructor<?> cnst : cnstr) {
                if (cnst.getModifiers() != 0) {
                    System.out.print("    " + Modifier.toString(cnst.getModifiers())
                            + " " + cnst.getName());
                } else {
                    System.out.print("    " + cnst.getName());
                }

                String sep = "";
                System.out.print("(");
                for (Parameter param : cnst.getParameters()) {
                    System.out.print(sep + param.getType().getSimpleName() + " " + param.getName());
                    sep = ", ";
                }
                System.out.println(");");
            }
        }


        Method[] mthd = cls.getDeclaredMethods();
        if (mthd.length != 0) {
            System.out.println("Методы класса :");
            for (Method mth : mthd) {
                for (Annotation an : mth.getAnnotations()) {
                    System.out.println("    @" + an.annotationType().getSimpleName());
                }
                if (mth.getModifiers() != 0) {
                    System.out.print("    " + Modifier.toString(mth.getModifiers())
                            + " " + mth.getReturnType().getSimpleName()
                            + " " + mth.getName());
                } else {
                    System.out.print("    " + mth.getReturnType().getSimpleName()
                            + " " + mth.getName());
                }

                String sep = "";
                System.out.print("(");
                for (Parameter param : mth.getParameters()) {
                    System.out.print(sep + param.getType().getSimpleName() + " " + param.getName());
                    sep = ", ";
                }
                System.out.println(");");
            }
        }
    }
}
