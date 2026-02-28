function login() {
    var role = document.getElementById("role").value;

    if (role === "admin") {
        window.location.href = "admin-dashboard.html";
    } else {
        window.location.href = "counselor-dashboard.html";
    }
}