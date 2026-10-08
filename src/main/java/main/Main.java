/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author kidst
 */

import controller.LigaController;
import view.MenuView;

public class Main {

    public static void main(String[] args) {

        MenuView view = new MenuView();
        LigaController controller = new LigaController(view);

        controller.jalankan();
    }
}