package main;

import beans.Cat;
import beans.Owner;
import configs.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try(var context  = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            Cat cat = context.getBean(Cat.class);
            Owner owner = context.getBean(Owner.class);

            cat.setName("Loc 1");

            System.out.println(cat);
            System.out.println(owner);
        }
    }
}
