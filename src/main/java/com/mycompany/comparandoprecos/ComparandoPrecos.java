/*Desenvolvendo um algoritmo para comparar preços.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparandoprecos;

/**Utilizei para a correção do código o ChatGPT, porque os últimos comandos não estavam funcionando.
 *
 * @author Heloisa Silva 1 DS/AMS
 */
import javax.swing.JOptionPane;

public class ComparandoPrecos {

    public static void main(String[] args) {
        // Entrada dos preços dos produtos
        double preco1 = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto 1:"));
        double preco2 = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto 2:"));
        double preco3 = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto 3:"));
        double preco4 = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto 4:"));

        // Verificando se há pelo menos um preço diferente dos demais
        if (preco1 != preco2 || preco1 != preco3 || preco1 != preco4 ||
            preco2 != preco3 || preco2 != preco4 ||
            preco3 != preco4) {
            JOptionPane.showMessageDialog(null, "Os produtos possuem preços diferentes.");
        } else {
            JOptionPane.showMessageDialog(null, "Os produtos possuem os preços iguais.");
        }

        // Verificando o menor preço
        if (preco1 < preco2 && preco1 < preco3 && preco1 < preco4) {
            JOptionPane.showMessageDialog(null, "Produto 1 é o mais barato: R$ " + preco1);
        } else if (preco2 < preco1 && preco2 < preco3 && preco2 < preco4) {
            JOptionPane.showMessageDialog(null, "Produto 2 é o mais barato: R$ " + preco2);
        } else if (preco3 < preco1 && preco3 < preco2 && preco3 < preco4) {
            JOptionPane.showMessageDialog(null, "Produto 3 é o mais barato: R$ " + preco3);
        } else if (preco4 < preco1 && preco4 < preco2 && preco4 < preco3) {
            JOptionPane.showMessageDialog(null, "Produto 4 é o mais barato: R$ " + preco4);
        } else {
            JOptionPane.showMessageDialog(null, "Dois ou mais produtos têm o menor preço.");
        }

        // Verificando o maior preço
        if (preco1 > preco2 && preco1 > preco3 && preco1 > preco4) {
            JOptionPane.showMessageDialog(null, "Produto 1 é o mais caro: R$ " + preco1);
        } else if (preco2 > preco1 && preco2 > preco3 && preco2 > preco4) {
            JOptionPane.showMessageDialog(null, "Produto 2 é o mais caro: R$ " + preco2);
        } else if (preco3 > preco1 && preco3 > preco2 && preco3 > preco4) {
            JOptionPane.showMessageDialog(null, "Produto 3 é o mais caro: R$ " + preco3);
        } else if (preco4 > preco1 && preco4 > preco2 && preco4 > preco3) {
            JOptionPane.showMessageDialog(null, "Produto 4 é o mais caro: R$ " + preco4);
        } else {
            JOptionPane.showMessageDialog(null, "Dois ou mais produtos têm o maior preço.");
        }

        // Verificando produtos > R$50
        String acima50 = "";
        if (preco1 > 50) acima50 += "Produto 1 (R$" + preco1 + ")\n";
        if (preco2 > 50) acima50 += "Produto 2 (R$" + preco2 + ")\n";
        if (preco3 > 50) acima50 += "Produto 3 (R$" + preco3 + ")\n";
        if (preco4 > 50) acima50 += "Produto 4 (R$" + preco4 + ")\n";

        if (!acima50.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Produtos com preço acima de R$50:\n" + acima50);
        }

        // Verificando produtos < R$50
        String abaixo50 = "";
        if (preco1 < 50) abaixo50 += "Produto 1 (R$" + preco1 + ")\n";
        if (preco2 < 50) abaixo50 += "Produto 2 (R$" + preco2 + ")\n";
        if (preco3 < 50) abaixo50 += "Produto 3 (R$" + preco3 + ")\n";
        if (preco4 < 50) abaixo50 += "Produto 4 (R$" + preco4 + ")\n";

        if (!abaixo50.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Produtos com preço abaixo de R$50:\n" + abaixo50);
        }

        // Verificando produtos == R$50
        String igual50 = "";
        if (preco1 == 50) igual50 += "Produto 1\n";
        if (preco2 == 50) igual50 += "Produto 2\n";
        if (preco3 == 50) igual50 += "Produto 3\n";
        if (preco4 == 50) igual50 += "Produto 4\n";

        if (!igual50.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Produtos com preço igual a R$50:\n" + igual50);
        }
    }
}
