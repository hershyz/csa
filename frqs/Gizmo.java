//Part A:
public int countElectronicsByMaker(String maker) {

    int counter = 0;
    for (int i = 0; i < purchases.size(); i++) {
        if (purchases.get(i).getMaker().equals(maker) && purchases.get(i).isElectronic()) {
            counter++;
        }
    }

    return counter;
}

//Part B:
public boolean hasAdjacentEqualPair() {
    
    if (purchases.size() < 2) {
        return false;
    }

    for (int i = 1; i < purchases.size(); i++) {
        if (purchases.get(i).equals(purchases.get(i - 1))) {
            return true;
        }
    }

    return false;
}

/*
    Part C:
    New variables, methods, and fields:
    - A price accessor method would have to be added to the Gizmo class .
    - A price variable in a constructor would have to be added to the Gizmo class to initialize cost.

    Method header: public Gizmo getCheapestGizmoByMaker(String maker)

    The price field in the Gizmo class would be private to avoid external modification.
    The accessor method in the Gizmo class would be public so that it allows for external access.
*/
