#include <iostream>
#include <cstdlib>

using namespace std;

class bank {
    private:
    int cid=0,id=0;
    char name[10];
    double balance;
    public:
    void menu();
    void registration();
    void login(int id);
    void verify();
};

bank clients[50];

void bank :: menu(){
    int ch;
    cout<<"WELCOME TO UNIONBANK"<<endl;
    cout<<"----REGISTRATION----"<<endl;
    cout<<"[1] Register"<<endl;
    cout<<"[2] Login"<<endl;
    cout<<"[3] Exit"<<endl;
    cout<<": ";cin>>ch;
    switch(ch){
        case 1: {
            registration();
            break;
        }
        case 2: {
            verify();
            break;
        }
        case 3: {
            exit(0);
            break;
        }
        default:
            exit(0);
    }
}

void bank :: registration(){
    this->cid+=1;
    clients[this->cid].id = this->cid;
    cout<<"----REGISTRATION----"<<endl;
    cout<<"Enter PIN: ";cin>>clients[this->cid].id;
    cout<<"Enter your name: ";cin>>clients[this->cid].name;
    cout<<"***Note: Minimum deposit is $500 \n Enter initial deposit: ";cin>>clients[this->cid].balance;
    if(clients[this->cid].balance < 500)
        exit(0);
    else
        cout<<"Congratulations you're now registered!"<<endl;
    
        menu();
}

void bank :: verify(){
    int vid;
    cout<<"Enter PIN for verification: ";cin>>vid;
    login(vid);
}

void bank :: login(int id){
    int ch;
    if(clients[this->cid].id != id){
        exit(0);
    }
    else
        cout<<"Login successful!"<<endl;
        cout<<"PIN used: "<<clients[this->cid].id<<endl;
        cout<<"Name: "<<clients[this->cid].name<<endl;
        cout<<"Balance: "<<clients[this->cid].balance<<endl;
        cout<<"[1] Deposit"<<endl;
        cout<<"[2] Withdraw"<<endl;
        cout<<"[3] Back to Menu"<<endl;
        cout<<": ";cin>>ch;
        switch(ch){
            case 1: {
                double Deposit;
                cout<<"Enter amount to deposit: ";cin>>Deposit;
                clients[this->cid].balance+=Deposit;
                login(id);
                break;
            }
                case 2: {
                double Withdraw;
                cout<<"Enter amount to withdraw: ";cin>>Withdraw;
                clients[this->cid].balance-=Withdraw;
                login(id);
                break;
            }
                case 3: {
                    menu();
                break;
            }
            default:
                exit(0);
        }
}

int main(){
    bank start;
    start.menu();
}