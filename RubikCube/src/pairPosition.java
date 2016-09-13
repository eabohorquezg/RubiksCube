/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AndresL
 */
public class pairPosition implements Comparable<pairPosition>{
    
    private Integer diferences;
    private Long position;

    public pairPosition(Integer difernces, Long position) {
        this.diferences = difernces;
        this.position = position;
    }
    
    @Override
    public int compareTo(pairPosition o) {
        return this.diferences.compareTo(o.diferences);
    }

    @Override
    public String toString() {
        return Integer.toString(diferences)+","+Long.toString(position); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    /**
     * @return the diferences
     */
    public Integer getDiferences() {
        return diferences;
    }

    /**
     * @param diferences the difernces to set
     */
    public void setDiferences(Integer diferences) {
        this.diferences = diferences;
    }

    /**
     * @return the position
     */
    public Long getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Long position) {
        this.position = position;
    }
    
}
