package za.ac.cput.repository;

import za.ac.cput.domain.Branch;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;


/*
 * Class Name: BranchRepository
 * Description: Branch  Repository class
 * Author: Sive Mdali(2405108252)
 * Date: 22 March 2026
 */

public class BranchRepository {

    // Simulate data persistence
    private Map<String, Branch> branchMap = new HashMap<>();

    // Save a new Branch
    public Branch save(Branch branch) {
        branchMap.put(branch.getBranchId(), branch);
        return branch;
    }

    // Find a Branch by ID
    public Branch findById(String branchId) {
        return branchMap.get(branchId);
    }

    // Get all Branches
    public List<Branch> getAll() {
        return new ArrayList<>(branchMap.values());
    }

    // Delete a Branch by ID
    public boolean delete(String branchId) {
        return branchMap.remove(branchId) != null;
    }
}
