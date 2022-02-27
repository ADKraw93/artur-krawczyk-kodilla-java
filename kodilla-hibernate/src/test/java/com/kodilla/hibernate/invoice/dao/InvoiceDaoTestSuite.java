package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("1/2/2022A");
        Product sugar = new Product("sugar");
        Product milk = new Product("milk");
        Product apples = new Product("apples");

        Item itemSugar = new Item(sugar, new BigDecimal(1.49), 3, invoice);
        Item itemMilk = new Item(milk, new BigDecimal(1.99), 2, invoice);
        Item itemApples = new Item(apples, new BigDecimal(3.99), 5, invoice);

        sugar.getListOfItems().add(itemSugar);
        milk.getListOfItems().add(itemMilk);
        apples.getListOfItems().add(itemApples);

        invoice.getItems().add(itemSugar);
        invoice.getItems().add(itemMilk);
        invoice.getItems().add(itemApples);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        /*itemDao.save(itemSugar);
        int sugarId = sugar.getId();
        itemDao.save(itemMilk);
        int milkId = milk.getId();
        itemDao.save(itemApples);
        int applesId = apples.getId();*/

        //Then
        assertNotEquals(0, invoiceId);

        //Cleanup
        /*try {
            invoiceDao.deleteById(invoiceId);
        } catch (Exception e) {
            //do nothing
        }*/
    }
}
