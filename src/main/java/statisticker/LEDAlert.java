package statisticker;

class LEDAlert implements IAlerter{
    boolean ledGlows = false;
    @Override
    public void setAlert(boolean bool) {
        // TODO Auto-generated method stub
        this.ledGlows = bool;
    }
}
