public class IsFirstComeFirstServed {

    public IsFirstComeFirstServed() {
    }

    public boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {

        // check if we're serving orders first-come, first-served
        boolean isfcfs = true;

        if(takeOutOrders.length+dineInOrders.length!=servedOrders.length)
            return false;

        int t =0;
        int d =0;

        for(int i=0;i<servedOrders.length;i++){

            if(t<=takeOutOrders.length-1 && d>dineInOrders.length-1) {
                if (takeOutOrders[t] != servedOrders[i]) {
                    isfcfs = false;
                    break;
                } else
                    t++;
            }
            if(t>takeOutOrders.length-1 && d<=dineInOrders.length-1) {
                if (dineInOrders[d] != servedOrders[i]) {
                    isfcfs = false;
                    break;
                } else
                    d++;
            }
            if(d<=dineInOrders.length-1 && t<=takeOutOrders.length-1){
                if( dineInOrders[d]<takeOutOrders[t] && dineInOrders[d]==servedOrders[i]){
                    d++;
                }
                else if(takeOutOrders[t]<dineInOrders[d] && takeOutOrders[t] == servedOrders[i]){
                    t++;
                }else{
                    isfcfs = false;
                    break;
                }
            }

        }

       return isfcfs;
    }
}
