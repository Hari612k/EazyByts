// app.js

// Example JavaScript code for interactivity
document.addEventListener('DOMContentLoaded', function() {
    // Example: Fetch and display customer list
    fetchCustomerList();
});

function fetchCustomerList() {
    // Example fetch request to API endpoint (replace with actual API integration)
    fetch('/api/customers')
        .then(function(response) {
            return response.json();
        })
        .then(function(data) {
            const customerListContainer = document.querySelector('.customer-list');
            customerListContainer.innerHTML = ''; // Clear previous content

            data.forEach(function(customer) {
                const customerItem = document.createElement('div');
                customerItem.textContent = customer.firstName + ' ' + customer.lastName;
                customerListContainer.appendChild(customerItem);
            });
        })
        .catch(function(error) {
            console.error('Error fetching customer list:', error);
        });
}
