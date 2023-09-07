class cmclass{
    int leftval;
    int rightval;
    double fraction;
    cmclass(int left,int right){
        this.leftval=left;
        this.rightval=right;
        this.fraction=(double)leftval/(rightval*0.1);
    }

    public double getFraction(){
        return fraction;
    }
}