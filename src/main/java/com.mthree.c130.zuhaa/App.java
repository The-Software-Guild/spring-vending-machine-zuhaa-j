package com.mthree.c130.zuhaa;

import com.mthree.c130.zuhaa.controller.VendingMachineController;
import com.mthree.c130.zuhaa.dao.VendingMachinePersistenceException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) throws VendingMachinePersistenceException {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.mthree.c130.zuhaa");
        appContext.refresh();

        VendingMachineController controller = appContext.getBean("vendingMachineController", VendingMachineController.class);
        controller.run();
    }

}
