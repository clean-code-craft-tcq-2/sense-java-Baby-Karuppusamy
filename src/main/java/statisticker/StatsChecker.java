class StatsChecker{
    private float max;
    private IAlerter[] alerters;
    StatsChecker(float max, IAlerter[] alerters){
        this.max = max;
        this.alerters = alerters;
    }
    
    public void checkAndAlert(List<Float> numbers){
        for (Float number : numbers) {
            if(number > max){
                for(IAlerter alerter: alerters)
                    alerter.setAlert(true);
                return;
            }
        }
    }
}
