/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ems.motorph_ems;

import com.databaseCon.MotorPH_DB;
import com.home.MotorPH_LoginFrame;

/**
 *
 * @author hp
 */
public class MotorPH_EMS {

    public static void main(String[] args) {
        MotorPH_LoginFrame loginObj = new MotorPH_LoginFrame();
        loginObj.show();
        
        MotorPH_DB.loadConnection();
    }
}
