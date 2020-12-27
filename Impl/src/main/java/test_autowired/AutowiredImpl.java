package test_autowired;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class AutowiredImpl {

    public static void main(String[] args) {
        UserController userController = new UserController();

        Class<? extends UserController> clazz = UserController.class;

        // 获取所有的属性
        Stream.of(clazz.getDeclaredFields())
                .forEach(new Consumer<Field>() {
                    @Override
                    public void accept(Field field) {
                        Autowired annotation = field.getAnnotation(Autowired.class);
                        if (annotation != null) {
                            field.setAccessible(true);
                            Class<?> type = field.getType();
                            Object o = null;
                            try {
                                o = type.getDeclaredConstructor().newInstance();
                                field.set(userController, o);
                            } catch (InstantiationException e) {
                                e.printStackTrace();
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            } catch (NoSuchMethodException e) {
                                e.printStackTrace();
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
        System.out.println(userController.getUserServer());
    }

}
