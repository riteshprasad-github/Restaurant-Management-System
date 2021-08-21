/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author RITESH PRASAD
 */
public class SuperClass_Parent {
    
    public double ChickenBiryani;
    public double ButterPaneerMasala;
    public double ChickenSeekKabab;
    public double ButterNam;
    public double NonvegNoodles;
    public double FriedRice;
    
    public double WaterBottle;
    public double Sprite;
    public double ThumsUp;
    public double LemonSoda;
    public double ChickenSoup;
    public double VegHotNSourSoup;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount()
    {
        Meals = ChickenBiryani + ButterPaneerMasala + ChickenSeekKabab + ButterNam + NonvegNoodles + FriedRice;
        Drinks = WaterBottle + Sprite + ThumsUp + LemonSoda + ChickenSoup + VegHotNSourSoup;
        
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD; 
    }
    
    private JFrame frame;
     
     public void iExitSystem()
     {
         frame = new JFrame("Exit");
         
         if (JOptionPane.showConfirmDialog(frame,"Comfirm if you want to exit","Royal Restuarent Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
         System.exit(0);
         }
             
     }

//===================== SET PRICE OF ITEMS =============================================//
    public double pChickenBiryani = 250.50;
    public double pButterPaneerMasala = 180.50;
    public double pChickenSeekKabab = 150.50;
    public double pButterNam = 25.50;
    public double pNonvegNoodles = 50.50;
    public double pFriedRice = 60.00;
    
    public double pWaterBottle = 20.10;
    public double pSprite = 60.50;
    public double pThumsUp = 60.50;
    public double pLemonSoda = 30.15;
    public double pChickenSoup = 60.50;
    public double pVegHotNSourSoup = 40.50;
     
//======================= TAX SET ===================================================//
     
    public double mcTax = 10.00;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax = (cAmount * (mcTax / 100));
        return FindTax;
    }
 //============================================================================================    
}
