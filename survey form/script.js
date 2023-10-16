const surveyForm = document.getElementById("surveyForm");
const popup = document.getElementById("popup");
const popupData = document.getElementById("popupData");
const resetButton = document.getElementById("resetButton");

function resetForm() {
    surveyForm.reset();
}

function closePopup() {
    popup.style.display = "none";
    surveyForm.reset();
}

function showPopup(data) {
    popupData.innerHTML = data;
    popup.style.display = "block";
}

function submitForm() {
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const genderElements = document.querySelectorAll("input[name='gender']:checked");
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;
    const question1 = document.querySelector("input[name='question1']:checked");
    const question2 = document.querySelector("input[name='question2']:checked");
    const suggestions = document.getElementById("suggestions").value;

    if (
        firstName === "" ||
        lastName === "" ||
        dob === "" ||
        country === "" ||
        genderElements.length === 0 ||
        profession === "" ||
        email === "" ||
        mobile === "" ||
        question1 === null ||
        question2 === null
    ) {
        alert("Please fill out all required fields and answer all questions.");
        return;
    }

    const data = `
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>
        <p><strong>Country:</strong> ${country}</p>
        <p><strong>Gender:</strong> ${Array.from(genderElements, el => el.value).join(", ")}</p>
        <p><strong>Profession:</strong> ${profession}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Mobile Number:</strong> ${mobile}</p>
        <p><strong>Question 1:</strong> ${question1.value}</p>
        <p><strong>Question 2:</strong> ${question2.value}</p>
        <p><strong>Suggestions:</strong> ${suggestions}</p>
    `;

    showPopup(data);
}
