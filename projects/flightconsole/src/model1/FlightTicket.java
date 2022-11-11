package model1;

public class FlightTicket {
    private int pnrNo;
    private String arrivalCity;
    private String departureCity;
    private int flightNo;
    private int totalBooking;
    private int tempSeatCount;

    public FlightTicket(int pnrNo, String arrivalCity, String departureCity, int flightNo, int totalBooking, int tempSeatCount) {
        this.pnrNo = pnrNo;
        this.arrivalCity = arrivalCity;
        this.departureCity = departureCity;
        this.flightNo = flightNo;
        this.totalBooking = totalBooking;
        this.tempSeatCount=tempSeatCount;
    }
    public int getTempSeatCount() {
        return tempSeatCount;
    }

    public void setTempSeatCount(int tempSeatCount) {
        this.tempSeatCount = tempSeatCount;
    }
    public int getPnrNo() {
        return pnrNo;
    }
    public void setPnrNo(int pnrNo) {
        this.pnrNo = pnrNo;
    }
    public String getArrivalCity() {
        return arrivalCity;
    }
    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }
    public String getDepartureCity() {
        return departureCity;
    }
    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }
    public int getFlightNo() {
        return flightNo;
    }
    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }
    public int getTotalBooking() {
        return totalBooking;
    }
    public void setTotalBooking(int totalBooking) {
        this.totalBooking = totalBooking;
    }
    @Override
    public String toString() {
        return "FlightTicket{" +
                "pnrNo=" + pnrNo +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", flightNo=" + flightNo +
                ", totalBooking=" + totalBooking +
                '}';
    }
}
