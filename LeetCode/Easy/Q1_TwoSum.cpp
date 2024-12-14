#include <iostream>
#include <vector>
#include <string>

using namespace std;


vector<int> twoSum(vector<int> &nums, int target) {
    for (int i = 0; i < nums.size(); i++) {
        for (int j = i + 1; j < nums.size(); j++) {
            if (nums[j] == target - nums[i]) {
                return {i, j};
            }
        }
    }
    // Return an empty vector if no solution is found
    return {};
} 

void printVector(const vector<int>& vec) {
    cout << "[";
    for (size_t i = 0; i < vec.size(); i++) {
        cout << vec[i];
        if (i < vec.size() - 1) cout << ", ";
    }
    cout << "]" << endl;
}


int main() {
    std::vector<int> input1 = {2, 7, 11, 15};
    std::vector<int> input2 = {3, 2, 4};
    std::vector<int> input3 = {3, 3};

    int target1 = 9;
    int target2 = 6;

    printVector(twoSum(input1, target1));
    printVector(twoSum(input2, target2));
    printVector(twoSum(input3, target2));

}

