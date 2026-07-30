class Solution {
public:
    vector<int> circularGameLosers(int n, int k) {

        vector<bool> visited(n, false);

        int current = 0;
        int turn = 1;

        while (!visited[current]) {
            visited[current] = true;
            current = (current + turn * k) % n;
            turn++;
        }

        vector<int> ans;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans.push_back(i + 1);
            }
        }

        return ans;
    }
};