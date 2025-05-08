/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Faker;

import com.github.javafaker.Faker;
import java.util.Locale;

/**
 *
 * @author pagam
 */
public interface InterfaceFaker {
    Faker faker = new Faker(new Locale("pt-BR"));
    
}
