package statisticker;

class EmailAlert implements IAlerter{
    boolean emailSent = false;
    @Override
    public void setAlert(boolean bool) {
        // TODO Auto-generated method stub
        this.emailSent = bool;
    }
}
