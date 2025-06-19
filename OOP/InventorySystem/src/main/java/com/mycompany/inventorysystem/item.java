
package com.mycompany.inventorysystem;

public class item {
    
    private String name;
    private String type;
    private date datePurchased;
    private date expiryDate;

    item()
    {
    
    }
    public item(String name, String type, date datePurchased, date expiryDate) 
    {
        this.name = name;
        this.type = type;
        this.datePurchased = datePurchased;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public date getDatePurchased() {
        return datePurchased;
    }

    public void setDatePurchased(date datePurchased) {
        this.datePurchased = datePurchased;
    }

    public date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(date expiryDate) {
        this.expiryDate = expiryDate;
    }
    
    public String infoItem(){
        if(expiryDate!=null)
        return "Name: " + name + " Type: "+ type +" Date Purchased: "+datePurchased.infoDate()+" expiryDate: "+expiryDate.infoDate()+"\n";
        else
            return "Name: " + name + " Type: "+ type +" Date Purchased: "+datePurchased.infoDate();
    }


    
}
