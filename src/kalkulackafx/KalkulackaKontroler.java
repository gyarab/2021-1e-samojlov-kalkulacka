package kalkulackafx;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * @author Vladimír Samojlov, 1.E
 */
public class KalkulackaKontroler implements Initializable {
    
    @FXML
    private Button AC;
    
    @FXML
    private TextField VysledekVypoctu;
    
    @FXML
    private Button ctyri;
    
    @FXML
    private Button delete;
    
    @FXML
    private Button delit;
    
    @FXML
    private Button devet;
    
    @FXML
    private Button dva;
    
    @FXML
    private Button jedna;
    
    @FXML
    private Button minus;
    
    @FXML
    private Button mocnit;
    
    @FXML
    private Button nasobit;
    
    @FXML
    private Button nula;
    
    @FXML
    private Button odmocnit;
    
    @FXML
    private Button osm;
    
    @FXML
    private Button pet;
    
    @FXML
    private Button plus;
    
    @FXML
    private Button rovnat;
    
    @FXML
    private Button sedm;
    
    @FXML
    private Button sest;
    
    @FXML
    private Button tecka;
    
    @FXML
    private Button tri;
    
    double cislo1;
    double cislo2;
    int operator;
    int Pocet;
    float FloatVysledek;
    double DoubleVysledek2;
    double DoubleVysledek;
    
    public void Vypocet(ActionEvent event) {
        
        if (event.getSource() == jedna) {
            VysledekVypoctu.appendText("1");
            
        } else if (event.getSource() == dva) {
            VysledekVypoctu.appendText("2");
            
        } else if (event.getSource() == tri) {
            VysledekVypoctu.appendText("3");
            
        } else if (event.getSource() == ctyri) {
            VysledekVypoctu.appendText("4");
            
        } else if (event.getSource() == pet) {
            VysledekVypoctu.appendText("5");
            
        } else if (event.getSource() == sest) {
            VysledekVypoctu.appendText("6");
            
        } else if (event.getSource() == sedm) {
            VysledekVypoctu.appendText("7");
            
        } else if (event.getSource() == osm) {
            VysledekVypoctu.appendText("8");
            
        } else if (event.getSource() == devet) {
            VysledekVypoctu.appendText("9");
            
        } else if (event.getSource() == nula) {
            VysledekVypoctu.appendText("0");
            
        } else if (event.getSource() == tecka && Pocet == 0) {
            // Volba: Tečka s počtem nula

            VysledekVypoctu.appendText(".");
            // Po stisknutí je vypsán symbol desetinné tečky

            Pocet = 1; // Pouze jednu tečku lze použít v číslu

        } else if (event.getSource() == AC) {
            VysledekVypoctu.setText("");
            VysledekVypoctu.setFont(Font.font("System", FontWeight.BOLD, 35));
            
            cislo1 = 0;
            cislo2 = 0;
            operator = 0;
            Pocet = 0;
            
        } else if (event.getSource() == delete) {
            VysledekVypoctu.setText(VysledekVypoctu.getText().substring(0, VysledekVypoctu.getText().length() - 1));
            
        } else if (event.getSource() == plus) {
            
            try {
                
                cislo1 = Double.parseDouble(VysledekVypoctu.getText());
                VysledekVypoctu.setText("");
                operator = 1;
                Pocet = 0;
                
            } catch (NumberFormatException e) {
                VysledekVypoctu.setText("Error");
            }
            
        } else if (event.getSource() == minus) {
            
            try {
                
                cislo1 = Double.parseDouble(VysledekVypoctu.getText());
                VysledekVypoctu.setText("");
                operator = 2;
                Pocet = 0;
                
            } catch (NumberFormatException e) {
                VysledekVypoctu.setText("Error");
            }
            
        } else if (event.getSource() == nasobit) {
            
            try {
                
                cislo1 = Double.parseDouble(VysledekVypoctu.getText());
                VysledekVypoctu.setText("");
                operator = 3;
                Pocet = 0;
                
            } catch (NumberFormatException e) {
                VysledekVypoctu.setText("Error");
            }
            
        } else if (event.getSource() == delit) {
            
            try {
                cislo1 = Double.parseDouble(VysledekVypoctu.getText());
                VysledekVypoctu.setText("");
                operator = 4;
                Pocet = 0;
                
            } catch (NumberFormatException e) {
                VysledekVypoctu.setText("Error");
            }
            
        } else if (event.getSource() == mocnit) {
            
            try {
                cislo1 = Math.pow(2, DoubleVysledek);
                VysledekVypoctu.setText("");
                operator = 5;
                Pocet = 0;
                
            } catch (NumberFormatException e) {
                VysledekVypoctu.setText("Error");
            }
            
        } else if (event.getSource() == odmocnit) {
            
            try {
                cislo1 = Math.pow(2, DoubleVysledek);
                VysledekVypoctu.setText("");
                operator = 6;
                Pocet = 0;
                
            } catch (NumberFormatException e) {
                VysledekVypoctu.setText("Error");
            }
            
        } else if (event.getSource() == rovnat && operator > 0) {
            // Po stisknutí rovnítka a operátoru, který musí být větší něž 0
            // => Operátory jsou od 0 do 6
            try {
                
                cislo2 = Double.parseDouble(VysledekVypoctu.getText());
                // V případě, že první číslo je operace, druhé číslo musí být rovnítko
            } catch (NumberFormatException e) {
                VysledekVypoctu.setText("Error");
            }
            DecimalFormat x = new DecimalFormat("#.###############");
            
            switch (operator) {
                
                case 1: //Scitani
                    DoubleVysledek = cislo1 + cislo2;
                    
                    if (DoubleVysledek == cislo1 + cislo2) {
                        VysledekVypoctu.setText(String.valueOf(x.format(DoubleVysledek)));
                    }
                    if (DoubleVysledek > -1 && DoubleVysledek < 1) {
                        VysledekVypoctu.setText("" + DoubleVysledek);
                    }
                    if (DoubleVysledek == 0) {
                        VysledekVypoctu.setText("0");
                    }
                    if (VysledekVypoctu.getText().length() > 16) {
                        VysledekVypoctu.setFont(Font.font("System", FontWeight.BOLD, 31.5));
                        VysledekVypoctu.setText(String.valueOf(DoubleVysledek));
                    }
                    if (VysledekVypoctu.getText().length() > 20) {
                        VysledekVypoctu.setText("Přesažení limitu");
                    }
                    break;
                
                case 2:  //Odcitani
                    DoubleVysledek2 = cislo1 - cislo2;
                    
                    if (DoubleVysledek2 == cislo1 - cislo2) {
                        VysledekVypoctu.setText(String.valueOf(x.format(DoubleVysledek2)));
                    }
                    FloatVysledek = (float) (cislo1 - cislo2);
                    if (FloatVysledek == cislo1 - cislo2) {
                        VysledekVypoctu.setText(String.valueOf(x.format((float) FloatVysledek)));
                    }
                    if (FloatVysledek > -1 && FloatVysledek < 1) {
                        VysledekVypoctu.setText("" + FloatVysledek);
                    }
                    if (FloatVysledek == 0) {
                        VysledekVypoctu.setText("0");
                    }
                    if (VysledekVypoctu.getText().length() > 16) {
                        VysledekVypoctu.setFont(Font.font("System", FontWeight.BOLD, 31.5));
                        VysledekVypoctu.setText(String.valueOf(FloatVysledek));
                    }
                    if (VysledekVypoctu.getText().length() > 20) {
                        VysledekVypoctu.setText("Přesažení limitu");
                    }
                    break;
                
                case 3: //Nasobeni 
                    DoubleVysledek = cislo1 * cislo2;
                    
                    if (DoubleVysledek == cislo1 * cislo2) {
                        VysledekVypoctu.setText(String.valueOf(x.format(DoubleVysledek)));
                    }
                    if (DoubleVysledek > -1 && DoubleVysledek < 1) {
                        VysledekVypoctu.setText("" + DoubleVysledek);
                    }
                    if (DoubleVysledek == 0) {
                        VysledekVypoctu.setText("0");
                    }
                    if (VysledekVypoctu.getText().length() > 16) {
                        VysledekVypoctu.setFont(Font.font("System", FontWeight.BOLD, 31.5));
                        VysledekVypoctu.setText(String.valueOf(DoubleVysledek));
                    }
                    if (VysledekVypoctu.getText().length() > 20) {
                        VysledekVypoctu.setText("Přesažení limitu");
                    }
                    break;
                
                case 4:  //Deleni
                    DoubleVysledek = cislo1 / cislo2;
                    
                    if (DoubleVysledek == cislo1 / cislo2) {
                        VysledekVypoctu.setText(String.valueOf(x.format(DoubleVysledek)));
                    }
                    if (cislo2 == 0) {
                        VysledekVypoctu.setText("Nulou nelze dělit!");
                    }
                    if (DoubleVysledek > -1 && DoubleVysledek < 1) {
                        VysledekVypoctu.setText("" + DoubleVysledek);
                    }
                    if (DoubleVysledek == 0) {
                        VysledekVypoctu.setText("0");
                    }
                    if (VysledekVypoctu.getText().length() > 18) {
                        VysledekVypoctu.setFont(Font.font("System", FontWeight.BOLD, 31.5));
                        VysledekVypoctu.setText(String.valueOf(DoubleVysledek));
                    }
                    if (VysledekVypoctu.getText().length() > 20) {
                        VysledekVypoctu.setText("Přesažení limitu");
                    }
                    break;
                
                case 5:  // Druhá Mocnina
                    DoubleVysledek = Math.pow(cislo2, 2);
                    
                    if (DoubleVysledek == Math.pow(cislo2, 2)) {
                        VysledekVypoctu.setText(String.valueOf(x.format(DoubleVysledek)));
                    }
                    if (DoubleVysledek > -1 && DoubleVysledek < 1) {
                        VysledekVypoctu.setText("" + DoubleVysledek);
                    }
                    if (DoubleVysledek == 0) {
                        
                        VysledekVypoctu.setText("0");
                    }
                    if (cislo2 > 0 && cislo2 < 1) {
                        VysledekVypoctu.setText(VysledekVypoctu.getText().substring(0, VysledekVypoctu.getText().length() - 1));
                    }
                    if (VysledekVypoctu.getText().length() > 16) {
                        VysledekVypoctu.setFont(Font.font("System", FontWeight.BOLD, 31.5));
                        VysledekVypoctu.setText(String.valueOf(DoubleVysledek));
                    }
                    if (VysledekVypoctu.getText().length() > 20) {
                        VysledekVypoctu.setText("Přesažení limitu");
                    }
                    break;
                
                case 6:  // Druhá Odmocnina
                    DoubleVysledek = Math.sqrt(cislo2);
                    
                    if (DoubleVysledek == Math.sqrt(cislo2)) {
                        VysledekVypoctu.setText(String.valueOf(x.format(DoubleVysledek)));
                    }
                    if (DoubleVysledek > -1 && DoubleVysledek < 1) {
                        VysledekVypoctu.setText("" + DoubleVysledek);
                    }
                    if (DoubleVysledek == 0) {
                        
                        VysledekVypoctu.setText("0");
                    }
                    if (cislo2 > 0 && cislo2 < 1) {
                        VysledekVypoctu.setText(VysledekVypoctu.getText().substring(0, VysledekVypoctu.getText().length() - 1));
                    }
                    if (VysledekVypoctu.getText().length() > 16) {
                        // Pokud výsledek přesáhne délku 16 znaků

                        VysledekVypoctu.setFont(Font.font("System", FontWeight.BOLD, 31.5));
                        // Stanovení fontu písma 

                        VysledekVypoctu.setText(String.valueOf(DoubleVysledek));
                        // Stanovení výsledku bez formátu x, použití vědecké notace
                    }
                    
                    if (VysledekVypoctu.getText().length() > 20) {
                        VysledekVypoctu.setText("Přesažení limitu");
                    }
                    break;
                
                default:
                    break;
                
            }
            operator = 0;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        VysledekVypoctu.setEditable(false);
        
    }
}
