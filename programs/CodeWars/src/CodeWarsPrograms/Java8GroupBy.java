package CodeWarsPrograms;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class Java8GroupBy {
    public static void main(String[] args) {
        List<Delivery> deliveries = Arrays.asList(
                new Delivery(1,"Book", 240, "8484", "123456"),
                new Delivery(2,"Pen", 240, "8484", "123456"),
                new Delivery(7,"Pen", 240,"8484", "123456"),
                new Delivery(8,"Pen", 240,"8484", "123456"),
                new Delivery(3,"Table",240, "9898", "123456"),
                new Delivery(4,"Laptop",240, "8484", "123459"),
                new Delivery(5,"Desktop", 240,"8484", "123459")
        );


        deliveries
                .stream()
                .collect(groupingBy(Delivery::getAccoutNum, groupingBy(Delivery::getZipCode)))
                .forEach((acc, accVal) -> accVal.forEach((zip, zipVal) -> {
                    zipVal.subList(1,zipVal.size())
                            .forEach(delivery -> delivery.setDropTime(0));
                }));



         /*deliveries.stream().forEach(System.out::println);
        Map<GroupAccZip, List<Delivery>> result =
                deliveries.stream().collect(
                        groupingBy(delivery -> new GroupAccZip(delivery.getZipCode(),delivery.getAccoutNum()))
                );*/
       /* List<Delivery> finalresult = new ArrayList<>();
        result2.forEach((accNo,accVal) -> {
            accVal.forEach((zip, zipVal) -> {
                finalresult.add(zipVal.get(0));
                zipVal.subList(1,zipVal.size()).forEach( delivery -> {
                    delivery.setName("");
                    finalresult.add(delivery);
                })
                ;
            });

        });*/

       /* result.forEach((key,value) -> {
            if(value.size()>1){
                value.subList(1,value.size()).forEach(delivery -> delivery.setName(""));
            }
        });*/
        System.out.println(deliveries);
    }

    public static class GroupAccZip{
        String zipCode;
        String accountNumber;

        public GroupAccZip(String zipCode, String accoutNum) {
            this.zipCode = zipCode;
            this.accountNumber = accoutNum;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            GroupAccZip that = (GroupAccZip) o;
            return Objects.equals(zipCode, that.zipCode) &&
                    Objects.equals(accountNumber, that.accountNumber);
        }

        @Override
        public int hashCode() {
            return Objects.hash(zipCode, accountNumber);
        }
    }

    public static class Delivery {
        int id;
        String name;
        long dropTime;
        String zipCode;
        String accoutNum;

        public Delivery(int id, String name, long dropTime, String zipCode, String accoutNum) {
            this.id = id;
            this.name = name;
            this.dropTime = dropTime;
            this.zipCode = zipCode;
            this.accoutNum = accoutNum;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getDropTime() {
            return dropTime;
        }

        public void setDropTime(long dropTime) {
            this.dropTime = dropTime;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        public String getAccoutNum() {
            return accoutNum;
        }

        public void setAccoutNum(String accoutNum) {
            this.accoutNum = accoutNum;
        }
    }
}
