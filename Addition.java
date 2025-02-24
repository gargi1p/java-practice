#include <bits/stdc++.h>
using namespace std;

struct Node {
    int x, y, dist;
    string path;
};

int n, m;
vector<string> grid;
vector<vector<bool>> visited;
vector<int> dx = {-1, 1, 0, 0};  // Directions for movement (U, D, L, R)
vector<int> dy = {0, 0, -1, 1};
string dir = "UDLR";  // Corresponding direction characters

bool isValid(int x, int y) {
    return x >= 0 && x < n && y >= 0 && y < m && grid[x][y] != '#' && !visited[x][y];
}

int main() {
    cin >> n >> m;
    grid.resize(n);
    visited.assign(n, vector<bool>(m, false));

    int ax, ay, bx, by;

    // Reading input and locating 'A' (start) and 'B' (end)
    for (int i = 0; i < n; i++) {
        cin >> grid[i];
        for (int j = 0; j < m; j++) {
            if (grid[i][j] == 'A') ax = i, ay = j;
            if (grid[i][j] == 'B') bx = i, by = j;
        }
    }

    queue<Node> q;
    q.push({ax, ay, 0, ""});
    visited[ax][ay] = true;

    while (!q.empty()) {
        Node node = q.front();
        q.pop();

        if (node.x == bx && node.y == by) {  // If we reach 'B'
            cout << "YES\n" << node.dist << "\n" << node.path << endl;
            return 0;
        }

        for (int i = 0; i < 4; i++) {
            int nx = node.x + dx[i], ny = node.y + dy[i];

            if (isValid(nx, ny)) {
                visited[nx][ny] = true;
                q.push({nx, ny, node.dist + 1, node.path + dir[i]});
            }
        }
    }

    cout << "NO\n";
    return 0;
}
