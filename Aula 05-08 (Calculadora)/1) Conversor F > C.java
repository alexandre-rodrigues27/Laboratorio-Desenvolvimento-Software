//Código digitado a partir do botão adicionado

private void btnConverterActionPerformed(java.awt.event.ActionEvent evt) {                                             
        double fahrenheit = Double.parseDouble(txtTemp.getText());
        double celsius = (fahrenheit - 32.0) / 1.8;
        lblResultado.setText(String.format("%.2f°C", celsius));
        // TODO add your handling code here:
    }
