package lesson03.quiz01;

public  class Ballpen extends Pen { // 볼펜
    private int amount; // 남은 량
    private String color; // 볼펜의 색

    public int getAmount() { 
        return amount; 
    }
    public void setAmount (int amount) { 
        this.amount = amount; 
    }
    public String getColor() { 
        return color; 
    }
    public void setColor(String color) { 
        this.color = color; 
    }
}