package Model;

/**
 * Created by lenovo on 7/5/2016.
 */
public class NamePhone {

        private String name;
        private int phone;

        public NamePhone(){

        }

        public NamePhone(String i, int p){

            this.name = i;
            this.phone = p;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPhone() {
            return phone;
        }

        public void getPhone(int phone) {
            this.phone = phone;
        }

    }

