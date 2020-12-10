/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/12/2020
 */
package risk;

import java.util.ArrayList;

public class RiskAnalysis {
    ArrayList<Risk> risks = new ArrayList();
    String title;

    public void addRisk() {
        Risk risk = new Risk();
        risk.setTitle("Navn");
        risks.add(risk);
        System.out.println("risk added");
    }

}
