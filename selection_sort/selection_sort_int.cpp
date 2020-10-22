#include <iostream>
#include <vector>

using namespace std;

int main() {
    vector<int> list {15,13,4,23,36,42,8,16,2,27,29,5};
    cout << "Original List" << endl;
    for (size_t num: list)
        cout << num << endl;
    
    for (int i {0}; i < list.size() - 1; i++) {
        size_t low = list.at(i);
        size_t low_index = i;
        
        for (int j {i + 1}; j < list.size(); j++) {
            if (list.at(j) < low) {
                low = list.at(j);
                low_index = j;
            }
        }
        list.at(low_index) = list.at(i);
        list.at(i) = low;
    }

    cout << endl << "Sorted List" << endl;
    for (size_t num: list)
        cout << num << endl;



    return 0;
}
