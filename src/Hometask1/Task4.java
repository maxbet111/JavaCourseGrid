package Hometask1;

public class Task4 {

    interface AccountService {
        /**
         * It finds an account by owner id
         * @param id owner unique identifier
         * @return account or null
         */
        Account findAccountByOwnerId(long id);
        /**
         * It count the number of account with balance > the given value
         * @param value
         * @return the number of accounts
         */
        long countAccountsWithBalanceGreaterThan(long value);
    }

// Declare and implement your AccountServiceImpl here

    static class Account {

        private long id;
        private long balance;
        private User owner;

        public Account(long id, long balance, User owner) {
            this.id = id;
            this.balance = balance;
            this.owner = owner;
        }

        public long getId() {
            return id;
        }

        public long getBalance() {
            return balance;
        }

        public User getOwner() {
            return owner;
        }
    }

    static class User {

        private long id;
        private String firstName;
        private String lastName;

        public User(long id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public long getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

     static class AccountServiceImpl implements AccountService {

        Account[]accounts;


        public AccountServiceImpl(Account[]acc ) {

            accounts = acc;


        }

        public Account findAccountByOwnerId(long id){
            for (int i = 0; i < accounts.length; i++) {

                if (accounts[i].owner.id == id){
                    return accounts[i];
                }

            }
            return null;

        }

        public long countAccountsWithBalanceGreaterThan(long value){


            long count = 0;

            for (int i = 0; i < accounts.length; i++) {

                if (accounts[i].balance > value){
                    count++;
                }

            }
            return count;

        }
        public static void main(String[] args) {

            Account[] accounts = new Account[]{
                    new Account(1,10,new User(154,"Max", "Test")),
                    new Account(2,15,new User(2,"Vlad", "Test2")),
                    new Account(3,20,new User(3,"Vova", "Test3")),
                    new Account(4,25,new User(4,"Maryna", "Test4")),
                    new Account(5,30,new User(5,"Nick", "Test5")),
                    new Account(6,35,new User(6,"Lianne", "Test6")),

            };
            AccountService service = new AccountServiceImpl(accounts);
            Account acc = service.findAccountByOwnerId(2); // returns an account where owner id is 10
           System.out.println(acc.id);

            long count = service.countAccountsWithBalanceGreaterThan(20);
            System.out.println(count);
        }

    }

}
