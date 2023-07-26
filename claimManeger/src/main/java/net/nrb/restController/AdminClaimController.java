package net.nrb.restController;
/*
import net.nrb.model.Claim;
import net.nrb.service.ClaimServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("admin/api/claim_mght")
public class AdminClaimController {
        @Autowired

        private ClaimServiceImpl claimService;


        // build create User REST API
        // http://localhost:8083/Admin/api/Claim_mght/save
       /* @PostMapping("/save")
        public ResponseEntity<Claim> createUser(@Valid @RequestBody Claim claim){
            //create unique tracking number
            String climNumber = String.format("%04d", new Random().nextInt(10000));
            claim.setClimNumber(climNumber);
            Claim savedClaim = claimService.createClaim(claim);
            return new ResponseEntity<>(savedClaim, HttpStatus.CREATED);
        }

        // build get user by id REST API
        // http://localhost:8083/Admin/api/Claim_mght/1
        @GetMapping("/{claimID}")
        public ResponseEntity<Claim> getUserById(@PathVariable("ClaimID") int  ClaimID){
            Claim Claim =claimService.getClaimById(ClaimID);
            return new ResponseEntity<>(Claim, HttpStatus.OK);
        }

        // Build Get All Users REST API
        // http://localhost:8083/Admin/api/Claim_mght/getAll
        @GetMapping("/getAll")
        public ResponseEntity<List<Claim>> getAllStudent(){
            List<Claim>claim =claimService.getAllClaim();
            return new ResponseEntity<>(claim, HttpStatus.OK);
        }

        // Build Update User REST API
        @PutMapping("/update/{claimId}")
        // http://localhost:8083/Admin/api/Claim_mght/update/2
        public ResponseEntity<Claim> updateUser(@PathVariable("claimId") int claimId,
                                                @RequestBody Claim claim){
            claim.setClaimId(claimId);
            Claim updateClaim =claimService.updateClaim(claim);
            return new ResponseEntity<>(updateClaim, HttpStatus.OK);
        }

        // Build Delete User REST API
        // http://localhost:8083/Admin/api/Claim_mght/Delete/2
        @DeleteMapping("/delete/{claimId}")
        public ResponseEntity<String> deleteUser(@PathVariable("claimId") int claimId){
            claimService.deleteClaim(claimId);
            return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
        }
    }
*/

