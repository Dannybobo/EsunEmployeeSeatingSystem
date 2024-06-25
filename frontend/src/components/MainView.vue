<template>
  <div>
    <label>Choose employee</label>
    <select v-model="selectedEmployee">
      <option v-for="employee in employees" :value="employee.empId" :key="employee.empId">
        {{ employee.empId }}
      </option>
    </select>

    <div class="seat-table">
      <div
        v-for="seat in seats"
        :key="seat.floorSeatSEQ"
        :class="[
          'seat',
          { occupied: seat.EmpID !== null, selected: selectedSeat === seat.floorSeatSEQ },
        ]"
        @click="selectSeat(seat.floorSeatSEQ)"
      >
        <div>{{ seat.floorNO }}樓：座位{{ seat.seatNO }}</div>
        <div v-if="seat.EmpID !== null">[員編: {{ seat.EmpID }}]</div>
      </div>
    </div>

    <button @click="saveBtn">Save</button>
    <button @click="clearBtn">Clear</button>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "MainView",
  data() {
    return {
      employees: [],
      selectedEmployee: null,
      seats: [],
      selectedSeat: null,
    };
  },
  mounted() {
    this.getAllEmployee();
  },
  methods: {
    getAllEmployee() {
      axios
        .get("/api/emps")
        .then((response) => {
          this.employees = response.data;
        })
        .catch((error) => {
          console.error("Error fetching employees:", error);
        });
    },
  },
};
</script>

<style></style>
