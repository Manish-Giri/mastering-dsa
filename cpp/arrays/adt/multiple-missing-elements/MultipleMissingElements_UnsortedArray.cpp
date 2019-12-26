#include<iostream>
using namespace::std;
    
void printMissingElements(int arr[], int length) {
    int l = 9999, h = -9999; 
    for (int i = 0; i < length; i++)
    {
        // compute min
        if(arr[i] < l) {
            l = arr[i];
        } 
        // compute max
        if(arr[i] > h) {
            h = arr[i];
        }
    }
    
    // create secondary array, starting from l till h - 1
    int secondary[h-l+1];
    for(int i = 0; i <= (h-l); i++) {
        secondary[i] = l+i;
    }

    int sec_length = sizeof(secondary)/sizeof(secondary[0]);
    
    // traverse secondary array and check if element is present in arr
    for (int i = 0; i < sec_length; i++)
    {
        /* code */
        int curr = secondary[i];
        bool present = false;
        for (int j = 0; j < length; j++)
        {
            if(arr[j] == curr) {
                present = true;
                break;
            }
        }
        if(!present) {
            cout << "Missing element: " << secondary[i] << endl;
        }
    }  
}
    
int main(int argc, char const *argv[])
{
    int A[] = {3,7,4,9,12,6,11,2,10};
    int length = sizeof(A)/sizeof(A[0]);
    printMissingElements(A, length);
    return 0;
}
