import kotlin.math.* 
for (k in 0..V-1){
    for (i in 0..V-1){
        for (j in 0..V-1){
            if (cost[i][k]!=100000000000 && cost[k][j]!=100000000000){
                cost[i][j] = min(cost[i][j], cost[i][k] + cost[k][j])
            }
        }
    }
}
